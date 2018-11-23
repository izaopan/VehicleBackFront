FROM nginx:alpine
RUN ls /etc/nginx/conf.d/
COPY nginx.conf /etc/nginx/conf.d/default.conf
COPY /build /usr/share/nginx/html
RUN ls /usr/share/nginx/html/
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]