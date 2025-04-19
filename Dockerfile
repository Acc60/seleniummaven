# Use base image with git and nginx
FROM nginx:alpine

# Install git
RUN apk update && apk add git

# Set working directory
WORKDIR /var/www/html/

# Clone repo (replace with your repo)
COPY frontend/ /var/www/html/ui/

COPY default.conf /etc/nginx/conf.d/default.conf

# Expose port 80
EXPOSE 80

# Start nginx
CMD ["nginx", "-g", "daemon off;"]
